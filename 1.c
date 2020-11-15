#include<stdio.h>


int main()
{


    FILE *fp;
    typedef struct student{

        char name[20];
        int mark1;
        int mark2;
        int mark3;

    }std;
    std ar[3];
    fp=fopen("my.txt","r");
    for(int i=0;i<3;i++)
    {
        fscanf(fp,"%s %d %d %d",ar[i].name,&ar[i].mark1,&ar[i].mark2,&ar[i].mark3);
    }

printf("    Name         mark1    mark2    mark3    Average\n\n");
    for(int i=0;i<3;i++)
    {
        printf("%10s%10d%10d%10d%10d\n",ar[i].name,ar[i].mark1,ar[i].mark2,ar[i].mark3,(ar[i].mark1+ar[i].mark2+ar[i].mark3)/3);

    }


        printf("\n   Average%10d%10d%10d\n",(ar[0].mark1+ar[1].mark1+ar[2].mark1)/3,(ar[0].mark2+ar[1].mark2+ar[2].mark2)/3,(ar[0].mark3+ar[1].mark3+ar[2].mark3)/3);


return 0;
}
