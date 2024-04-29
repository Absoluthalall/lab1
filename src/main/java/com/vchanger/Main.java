package com.vchanger;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Main {
    public static void main(String[] args) {
        University university = new University();
        Library library = new Library();
        BookIssuance bookIssuance = new BookIssuance(university,library);
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Top");
        DefaultMutableTreeNode firstNode = new DefaultMutableTreeNode("Students");
        DefaultMutableTreeNode secondNode = new DefaultMutableTreeNode("Teachers");
        top.add(firstNode);
        top.add(secondNode);
        for (int i = 0; i < university.getStudents().size(); i++) {
            DefaultMutableTreeNode student = new DefaultMutableTreeNode(university.students.get(i).getName());
            for (int j = 0; j <university.students.get(i).getBooks().size() ; j++) {
                DefaultMutableTreeNode book = new DefaultMutableTreeNode(university.students.get(i).getBooks().get(j).getName());
                student.add(book);
            }

            firstNode.add(student);
        }
        for (int i = 0; i < university.getTeachers().size(); i++) {
            DefaultMutableTreeNode teachers = new DefaultMutableTreeNode(university.teachers.get(i).getName());
            for (int j = 0; j <university.teachers.get(i).getBooks().size() ; j++) {
                DefaultMutableTreeNode book = new DefaultMutableTreeNode(university.teachers.get(i).getBooks().get(j).getName());
                teachers.add(book);
            }

            secondNode.add(teachers);
        }
        DefaultTreeModel treeModel = new DefaultTreeModel(top);
        JTree tree = new JTree(treeModel);
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);
    }
}