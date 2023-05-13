package CH_18_Linked_List;

public class O_1_Daynamic_Array {
    static class DynamicAtrray{
        int []arr;
        int capicty;
        int size;
        public DynamicAtrray(int capicty){
            this.capicty=capicty;
            this.arr=new int[capicty];
            size=0;
        }
        void add(int ele){
            if(isFull()){
                int [] newBigArray=new int[2*capicty];
                int i;
                for(i=0;i<size;i++){
                    newBigArray[i]=arr[i];
                }
                newBigArray[i]=ele;
                arr=newBigArray;
                size++;
                capicty=2*capicty;
            }
            else{
                arr[size]=ele;
                size++;
            }
        }
        void display(){
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }
        boolean isFull(){
            if(capicty==size){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        DynamicAtrray arrayList=new DynamicAtrray(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(55);
        arrayList.display();


    }
}
