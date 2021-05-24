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
//		//request���ý����ַ�����������
//		req.setCharacterEncoding("GBK");
		String fileName = "examplePhotoName";
		
		//�����ϴ�����
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//�����ڴ��ٽ�ֵ�������󽫲�����ʱ�ļ����洢����ʱĿ¼��
		factory.setSizeThreshold(10 * 1024 * 1024);
		//�����ϴ�����
		ServletFileUpload upload = new ServletFileUpload(factory);
//		//�����ϴ������ַ�����������
//		upload.setHeaderEncoding("GBK");
		
		try {
			//����汾���ص���List,û�з���,��Ҫunchecked
			@SuppressWarnings("unchecked")
			List<FileItem> fileItems = upload.parseRequest(req);
			for (FileItem fileItem : fileItems) {
				if (!fileItem.isFormField()) {
					File file = new File(req.getServletContext().getRealPath("uploadPhoto"), fileName);
					System.out.println(file.getAbsolutePath());
					file.getParentFile().mkdirs();
					
					try {
						fileItem.write(file);
						System.out.println("�ļ��ϴ��ɹ�");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					if ("photoName".equals(fileItem.getFieldName())) {
						//�������ý����ַ������ܴ������ģ�����ʹ�õ���Ĭ���ַ�������Ҳ�������ɶ
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
