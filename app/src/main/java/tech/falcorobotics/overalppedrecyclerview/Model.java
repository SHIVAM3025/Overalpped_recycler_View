package tech.falcorobotics.overalppedrecyclerview;

import android.widget.ImageView;

public class Model {

    private ImageView image;

    public Model(ImageView image) {
        this.image = image;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
