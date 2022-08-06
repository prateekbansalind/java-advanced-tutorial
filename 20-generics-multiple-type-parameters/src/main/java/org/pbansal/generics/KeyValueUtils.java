package org.pbansal.generics;

public class KeyValueUtils<K, V> {
    private K key;
    private V value;

    public KeyValueUtils(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void print(){
        System.out.println("The Key is " + key + " and value is " + value);
    }

}
