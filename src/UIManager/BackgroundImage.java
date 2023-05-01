//package UIManager;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class BackgroundImage extends JPanel {
//
//    private ImageIcon source;
//
//    public BackgroundImage(ImageIcon source, Dimension dimension) {
//        this.source = source;
//
//        setLayout(new BorderLayout());
//        setOpaque(false);
//
//        setPreferredSize(dimension);
//
//
//    }
//
//    public BackgroundImage (ImageSources imageSource) {
//        this(imageSource.sourceIcon, imageSource.imageDimension);
//    }
//
//    public void setSource(ImageIcon newSource) {
//        this.source = newSource;
//    }
//
//    public ImageIcon setSource() {
//        return source;
//    }
//
//    @Override
//    protected void paintComponent(Graphics graphic) {
//        super.paintComponent(graphic);
//        Dimension size = getSize();
//        graphic.drawImage(source.getImage(), 0, 0, size.width, size.height, this);
//    }
//}
