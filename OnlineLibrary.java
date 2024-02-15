package com.kirti.packages.JavaOOPsQuestion;
class Library{
    String[]books;
    int noofbooks;

    Library(){
        this.books=new String[55];;
        this.noofbooks=0;
    }
     public void Addbook(String book){
     //System.out.println("Add these new books in library");
     this.books[noofbooks]=book;
     noofbooks++;
     //System.out.println(noofbooks);
     }
    public void Issuebook(String book){
        for (int i=0;i<this.books.length;i++)
       if (this.books[i].equals(book)){
                System.out.println("The book which has been Issued is : "+ book);
            this.books[i]=null;
            return;}
            System.out.println("The book which you are looking for  does not exist ");
        }

    public void returnbook(String book){
     Addbook(book);
    }
    public void ShowAvailablebook(){
        System.out.println("Available books are: ");
        for (String book:this.books)
        {
            if(book ==null){
                continue;
            }
            System.out.println("The book is: "+ book);
        }
    }
}
public class OnlineLibrary {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.Addbook("RichAndPoorDad");
        lib.Addbook("DSA");
        lib.Addbook("OOPs");
        lib.ShowAvailablebook();
        lib.Issuebook("DSA");
        lib.ShowAvailablebook();
        lib.Addbook("DSA");
        lib.ShowAvailablebook();

        //System.out.println(noofbooks);
        
    }
    
}
