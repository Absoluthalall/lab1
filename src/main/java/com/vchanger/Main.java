package com.vchanger;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;


public class Main {
    public static DefaultMutableTreeNode func(ArrayList<Human> humans,String str) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(str);
        for (Human hum : humans) {
            DefaultMutableTreeNode node1 = new DefaultMutableTreeNode(hum.getName());
            for (Book b : hum.getBooks()) {
                DefaultMutableTreeNode book = new DefaultMutableTreeNode(b.getName());
                node1.add(book);
            }
            node.add(node1);
        }
        return node;

    }
    public static void main(String[] args) {
        University university = new University();
        Library library = new Library();
        BookIssuance bookIssuance = new BookIssuance(university,library);
        bookIssuance.Distribution();
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Top");
        top.add(func(university.getStudents(),"Students"));
        top.add(func(university.getTeachers(),"Teachers"));
        DefaultTreeModel treeModel = new DefaultTreeModel(top);
        JTree tree = new JTree(treeModel);
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);
    }
}