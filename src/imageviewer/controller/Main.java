package imageviewer.controller;

import java.io.File;
import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;

public class Main {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Anthony\\Pictures");
        FileImageLoader imageLoader = new FileImageLoader(folder);
        MainFrame mainFrame = new MainFrame(imageLoader);
        Image image = imageLoader.load();
        mainFrame.getImageDisplay().show(image);
    }
}
