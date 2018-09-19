package gr.teicrete.ie.oop2.arxp.main;

import gr.teicrete.ie.oop2.arxp.mvc.SingleSelectionController;
import gr.teicrete.ie.oop2.arxp.mvc.views.ComboBoxView;
import gr.teicrete.ie.oop2.arxp.mvc.views.RadioGroupView;
import gr.teicrete.ie.oop2.arxp.mvc.views.Slider;
import gr.teicrete.ie.oop2.arxp.mvc.views.TextView;

/**
 *
 * @author PK5
 */
public class Main {

    public static void main(String[] args) {
        SingleSelectionController singleSelectionController = new SingleSelectionController(3);

        ComboBoxView comboBoxView = new ComboBoxView(singleSelectionController);
        RadioGroupView radioGroupView = new RadioGroupView(singleSelectionController);
        TextView textView = new TextView(singleSelectionController);
        Slider slid = new Slider(singleSelectionController);
        //Slider slid = new Slider();
        
        
        singleSelectionController.registerSingleSelectionView(comboBoxView);
        singleSelectionController.registerSingleSelectionView(radioGroupView);
        singleSelectionController.registerSingleSelectionView(textView);
        singleSelectionController.registerSingleSelectionView(slid);
        
        
        slid.setVisible(true);
        comboBoxView.setVisible(true);
        radioGroupView.setVisible(true);
        textView.setVisible(true);
        slid.setSize(400,400);
        comboBoxView.setSize(100,100);
        radioGroupView.setSize(100,200);
        textView.setSize(300,100);
        comboBoxView.setLocation(200, 200);
        radioGroupView.setLocation(400, 200);
        textView.setLocation(600, 200);
        slid.setLocation(200,600);
    }

}
