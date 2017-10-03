/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jrodriguezs.a10;

/**
 *
 * @author Salvador
 */
public class  CList <T> 
{
    Node<T> pivot;
    Node<T> pointer;
    int length;
    public CList()
    {
        pivot = pointer = null;
        length = 0;
    }
    public CList(T d)
    {
        Node node = new Node(d);
        pivot = node.next=node;
        length++;
    }
    boolean isEmpty()
    {
        return length==0;
    }
    void insert(T d)
    {
        Node node = new Node(d);
        if(isEmpty())
        {
            pivot = node.next = node;
        }
        else
        {
            node.next = pivot.next;
            pivot.next = node;
        }
        length++;
    }
    void deleteNode(T d)
    {
        if(!isEmpty())
        {
            pointer=pivot;
            for(int i = 1;i<=length;i++)
            {
                pointer.next = pointer.next.next;
                if(pivot.data==d)
                {
                    pivot = pointer;
                }
                length--;
                pointer = null;
                i = length+1;
            }
            pointer = pointer.next;
        }
    }
    void deleteList()
    {
        
    }
    void showList()
    {
        
    }
    void showListbyAddress()
    {
        
    }
}
