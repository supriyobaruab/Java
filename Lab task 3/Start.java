public class Start {
   public static void main(String[] args){
        Book obj1 = new Book("0123","Learn React js","Sumit",300,4500);
        Book obj2 = new Book("4567","Cover C & C++","Anisul islam",450,3700);
        Book obj3 = new Book("8910","হাবলুদের জন্য প্রোগ্রামিং","Jhankar Mahbub",590,120);
        Book obj4 = new Book("1112","Python Programming","Tamim Shahriar Subeen",230,1103);
        Book obj5 = new Book("1314","Android App Development","Khalid Saifullah",810,302);

        Book arr1[] = new Book[5];
        arr1[0]=obj1;
        arr1[1]=obj2;
        arr1[2]=obj3;
        arr1[3]=obj4;
        arr1[4]=obj5;

        for(int i=0; i<arr1.length; i++){
            System.out.println("");
            arr1[i].showDetails();
        }
    }
}
