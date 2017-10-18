package ru.n2.t19.labs.lab1;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Class_2 {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPoint(new Point(100, 100));
        game.addPoint(new Point(900, 100));
        game.addPoint(new Point(100, 900));
        game.addPoint(new Point(900, 900));

        System.out.println(game.getxIndex());
        System.out.println(game.getyIndex());

        Point p1=new Point(800,800);
        Point p2=new Point(900,900);

        System.out.println(game.subField(p1, p2));

    }
}

class Game {

    private final NavigableSet<Point> xIndex = new TreeSet<>(new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            return (o1.getX() - o2.getX())==0 ? o1.getY() - o2.getY() : o1.getX() - o2.getX();
        }
    });
    private final NavigableSet<Point> yIndex = new TreeSet<>(new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            return (o1.getY() - o2.getY())==0 ? o1.getX() - o2.getX() : o1.getY() - o2.getY();

        }
    });

    public void addPoint(Point point) {
        xIndex.add(point);
        yIndex.add(point);
    }

    public Collection<Point> subField(Point point1,Point point2) {
        Collection<Point> xSelection=xIndex.subSet(point1,true,point2,true);
        Collection<Point> ySelection=yIndex.subSet(point1,true,point2,true);
        System.out.println(xSelection);
        System.out.println(ySelection);
        xSelection.retainAll(ySelection);
        return xSelection;
    }

    public NavigableSet<Point> getxIndex() {
        return xIndex;
    }

    public NavigableSet<Point> getyIndex() {
        return yIndex;
    }
}