package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MasterWillis on 04/12/2016.
 */

public class ButtonExpandListener implements ActionListener{

    RecursiveLsys lsys;
    int i;
    char c;

    public ButtonExpandListener(RecursiveLsys lsys, int i, char c){
        this.lsys = lsys;
        this.i = i;
        this.c = c;
    }

    public void expandNodeInTree(){

        String toBeExpanded = ""+c;
        String expandedTree = lsys.expand(toBeExpanded, 1);
        System.out.println(expandedTree);

        String currTree = lsys.getTree();
        //System.out.println("jeg skal expandes"+currTree);


        String newTree1 = currTree.substring(0,i);
        String newTree2 = expandedTree;
        String newTree3 = currTree.substring(i+1,currTree.length());

        String newTree = newTree1+newTree2+newTree3;

        lsys.setTree(newTree);

        /*
        * Recsys: I stedet for tree, skal der oprettes en rodknude.
        * Hver knude har leftRight / liste af børneknuder
        * Knudeværdi: bogstav
        * BladKnude: tom børneliste
        *
        * ToString
        *
         * Turtle = expand retter i træet og ikke i strengen
           * Hver knude får relateret en button
           * Knuder er actionlisteners.
           * Knudeobjekt lytter på om der bliver trykket på en knap
           * Hvis der trykkes kan der expandes.
        *
        * */


      //  System.out.println("jeg er del 1"+newTree1);
      //  System.out.println("jeg er del 2"+newTree2);
      //  System.out.println("jeg er del 3"+newTree3);
      //  System.out.println("Dette er mit bogstav: "+c);
      //  System.out.println("Dette er min placering: "+i);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
        expandNodeInTree();


    }

}
