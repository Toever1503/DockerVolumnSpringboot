package comm;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() throws IOException {

        File file = new File("/app/ImageTest.jpg");
        FileInputStream fis = new FileInputStream(file);

        FileOutputStream fos = new FileOutputStream("/app/uploads/ImageTest2.jpg");
        fos.write(fis.readAllBytes());
        fis.close();
        fos.close();
        return "test";
    }
}
