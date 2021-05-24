import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class UploadPhotoServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		//request设置解码字符集，无作用
//		req.setCharacterEncoding("GBK");
		String fileName = "examplePhotoName";
		
		//配置上传参数
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//设置内存临界值，超过后将产生临时文件并存储在临时目录中
		factory.setSizeThreshold(10 * 1024 * 1024);
		//创建上传对象
		ServletFileUpload upload = new ServletFileUpload(factory);
//		//设置上传解码字符集，无作用
//		upload.setHeaderEncoding("GBK");
		
		try {
			//这个版本返回的是List,没有泛型,需要unchecked
			@SuppressWarnings("unchecked")
			List<FileItem> fileItems = upload.parseRequest(req);
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {
					File file = new File(req.getServletContext().getRealPath("uploadPhoto"), fileName);
					System.out.println(file.getAbsolutePath());
					file.getParentFile().mkdirs();
					
					try {
						fileItem.write(file);
						System.out.println("文件上传成功");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					if ("photoName".equals(fileItem.getFieldName())) {
						//必须设置解码字符集才能处理中文，否则使用的是默认字符集，我也不清楚是啥
						fileName = fileItem.getString("GBK") + ".jpg";
					}
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		}
		String responseHtml = "<img src='uploadPhoto/%s'></img>";
		resp.setContentType("text/html;charset=GBK");
		resp.getWriter().format(responseHtml, fileName);
	}

}
