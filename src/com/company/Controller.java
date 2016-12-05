package com.company;

public class Controller {

    public Controller(){
        Txt textFileReader = new Txt();
        String textFileString = textFileReader.getTxtInput();

        Grammatik grammatik = new Grammatik(textFileString);
        RecursiveLsys lsys = new RecursiveLsys(grammatik);
        //String tree = lsys.getTree();

        StaticView staticView = new StaticView(lsys);

        ExpandKeyListener expandKeyListener = new ExpandKeyListener(lsys);


        staticView.addKeyListener(expandKeyListener);
        staticView.addExpandKeyListener(expandKeyListener);



    }


}
