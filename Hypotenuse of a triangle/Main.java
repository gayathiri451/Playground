#include<stdio.h>
int main()
{
float p,b,h;

scanf("%f %f",&p,&b);

h=sqrt((p*p)+(b*b));

printf("%0.2f",h);
  return 0;
}