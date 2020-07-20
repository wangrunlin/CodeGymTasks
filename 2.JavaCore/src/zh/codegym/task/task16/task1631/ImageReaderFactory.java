package zh.codegym.task.task16.task1631;

import zh.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory implements ImageReader {

    public static ImageReader getImageReader(ImageTypes type) throws IllegalArgumentException {

        if (type == ImageTypes.BMP)
            return new BmpReader();
        else if (type == ImageTypes.JPG)
            return new JpgReader();
        else if (type == ImageTypes.PNG)
            return new PngReader();
        else
            throw new IllegalArgumentException("未知图像类型");


//        if (type.equals(ImageTypes.BMP))
//            return new BmpReader();
//        else if (type.equals(ImageTypes.JPG))
//            return new JpgReader();
//        else if (type.equals(ImageTypes.PNG))
//            return new PngReader();
//        else
//            throw new IllegalArgumentException("未知图像类型");
    }
}
