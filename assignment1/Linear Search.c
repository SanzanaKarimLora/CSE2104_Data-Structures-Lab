#include <stdio.h>

int n, element, i;
int arr[1000];

void linearSearch(void);

int main(void)
{


  printf("\nEnter the number of elements: ");
  scanf("%d", &n);

  printf("\nEnter the elements: ");
  for(i = 0; i < n; i++)
  {
      scanf("%d", &arr[i]);
  }

  printf("\nEnter the element which you want to search: ");
  scanf("%d", &element);

  linearSearch();

  return 0;

}

void linearSearch()
{
    for(i = 0; i < n; i++)
    {
        if(arr[i] == element)
        {
            printf("\n%d is found in %d location.", element, i);
            break;
        }
    }

    if(i == n)
        printf("%d is not found in this array.", element);
}
