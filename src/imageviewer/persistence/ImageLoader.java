package imageviewer.persistence;

import imageviewer.model.Image;

public interface ImageLoader {
    Image load();
    Image next();
    Image prev();
}
