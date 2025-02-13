// Online C compiler to run C program online
#include <stdio.h>
    static int k = 10;


void roo(){
    printf("%d",k);
     k = 29;
    printf("\n");

}
void foo(){

    printf("%d",k);
    printf("\n");
    roo();

}
int main() {
    k = 15;
    foo();
    printf("%d",k);
    return 0;
}