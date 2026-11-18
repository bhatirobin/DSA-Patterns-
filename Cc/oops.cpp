#include<iostream>
using namespace std;
  

   class student
   {
    public:
    // agr public mei nhi lgau to mei main function ke andr data ko acces nhi kr skta
    //isliye hme ye define krna jruri hota hai ki ye claas data public hai ya private hi rhega 
    // private data are not acces to out of class is known as privata data class;
    //isme contructor bhi hote h jo by default call itself rehte hai
    //connstructor are many type dafault constructor,parameterrised constructor,copy constructor
    string name;
    int age;
    bool gender;
    float marks;
    //constructot ki trah ki distructor bhi hote hai jo object ke destroy hone pr automatically destroy ho jate hai
    //~ distructor ko isse represent krte hai 
    //isme na to kuch return hota hai or na call hota hai
    //or ye jb call hota hai jb hm main functio ke bahar nikl rhe hote hai 
    void printInfo()
    {
        cout<<"name = ";
           cout<<name<<endl;
            cout<<"age = ";
            cout<<age<<endl;
            cout<<"gender = ";
            cout<<gender<<endl;
            cout<<"marks = ";
            cout<<marks<<endl;
            
    }
   };
   int main()
   {
       /* student r;
        r.name="robin bhati";
        r.age=19;
        r.gender=1;
        r.marks=87.2*/
        student arr[5];
        for(int i=0;i<5;i++)
        {
            cout<<"name = ";
            cin>>arr[i].name;
            cout<<"age = ";
            cin>>arr[i].age;
            cout<<"gender = ";
            cin>>arr[i].gender;
            cout<<"marks = ";
            cin>>arr[i].marks;
            
        }
        for(int i=0;i<5;i++)
        {
            arr[i].printInfo();
        }
        return 0;
   }