package com.marvel.queue;

/**
 * 使用数组模拟实现队列
 */
public class ArrayQueueDemo {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.addQueue(1);
        queue.addQueue(2);
        queue.addQueue(3);
        queue.addQueue(4);
        queue.printQueue();

        System.out.println(queue.get());
        System.out.println(queue.get());
        System.out.println(queue.get());
//        System.out.println(queue.get());
        queue.printQueue();

    }

}

class ArrayQueue{
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1; //指向队列头部，front是指向队列头的第一个位置
        this.rear = -1; //指向队列尾，指向队列最后的一个元素
        this.arr = new int[maxSize];
    }

    /**
     * 判断队列是否已满
     */
    public boolean isFull(){
        return this.rear == maxSize-1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty(){
        return this.rear == front;
    }

    /**
     * 添加数据
     */
    public void addQueue(int data){
        if (this.isFull()){
            System.out.println("队列已满，不能继续添加数据");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    /**
     * 从队列中取出数据,出队列
     */
    public int get(){
        if (this.isEmpty()){
            throw new RuntimeException("队列为空");
        }
        front++;
        return arr[front];
    }

    /**
     * 显示队列所有的数据
     */
    public void printQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    /**
     * 显示队列的头数据
     */
    public void printFront(){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        System.out.printf("front:%d, arr[front]:%d ", front, arr[front]);
    }




}

