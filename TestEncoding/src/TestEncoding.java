import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TestEncoding {
	public static void main(String[] args) {
		String str = "";
		try {
			str = new String("µÇÂ¼".getBytes("cp1252"), Charset.forName("cp1252"));;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(str);
	}

}
