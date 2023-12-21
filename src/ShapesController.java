import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ShapesController {
	public static final int NUM_SHAPES = 10;
	public static final int RGB = 255;
	public static final double SIZE_LIMIT_CANVAS = 0.25;

    @FXML
    private Canvas canv;
    private GraphicsContext gc;
    
    public void initialize() {
    	gc = canv.getGraphicsContext2D();
    }
    // Function will be called when pressing the button
    @FXML
    void drawPressed(ActionEvent event) {
    	Random r = new Random();
    	int canvWidth = (int)canv.getWidth();
    	int canvHeight = (int)canv.getHeight();
    	int canvWidthMax = (int)(canvWidth*SIZE_LIMIT_CANVAS);
    	int canvHeightMax = (int)(canvHeight*SIZE_LIMIT_CANVAS);
    	int shape;
    	gc.clearRect(0, 0, canvWidth, canvHeight);
    	// Loop to pick 10 random shapes
    	for (int i = 0; i < NUM_SHAPES; i++) {   		
    		// Picking random colors
    		gc.setFill(Color.rgb(r.nextInt(RGB), r.nextInt(RGB), r.nextInt(RGB)));
    		gc.setStroke(Color.rgb(r.nextInt(RGB), r.nextInt(RGB), r.nextInt(RGB)));
    		// Picking random shape
    		shape = r.nextInt(3);
    		switch (shape) {
    			case 0:
    				gc.strokeLine(r.nextInt(canvWidth), r.nextInt(canvHeight), r.nextInt(canvWidthMax), r.nextInt(canvHeightMax));
    				break;
    			case 1:
    				gc.fillOval(r.nextInt(canvWidth), r.nextInt(canvHeight), r.nextInt(canvWidthMax), r.nextInt(canvHeightMax));
    				break;
    			default:
    				gc.fillRect(r.nextInt(canvWidth), r.nextInt(canvHeight), r.nextInt(canvWidthMax), r.nextInt(canvHeightMax));
    		}
    	}
    	
    }
       
}
