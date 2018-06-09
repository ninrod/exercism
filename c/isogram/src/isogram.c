#include "isogram.h"

#include <stdio.h>
#include <stdlib.h>

/* void qsort(void* ptr, size_t count, size_t size, int (*comp)(const void*, const void*)); */

bool is_isogram(const char phrase[]) {
  if(strlen(phrase) > 0) {
    return true;
  }
  return false;
}

int comp (const void* e1, const void *e2) {
  int a = *((char*) e1);
  int b = *((char*) e2);
  if (a < b)
    return -1;
  if (a > b)
    return 1;
  return 0;
}

int main() {
  char s[] = "filipe";
  printf("sizeof(s) = %d\n", (int)sizeof(s));
  printf("strnlen(s) = %d\n", (int)strlen(s));
  printf("sizeof(*s) = %d\n", (int)sizeof(*s));
  qsort(s, strlen(s), sizeof(*s), comp);
  printf("a string é: %s\n", s);
}