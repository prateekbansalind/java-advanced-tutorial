package org.pbansal;

public class User implements Comparable<User>{
    private int point;

    public User(int point){
        this.point = point;
    }

    @Override
    public int compareTo(User other) {
        return point - other.point;
    }

    @Override
    public String toString(){
        return "Point: " + point;
    }
}
