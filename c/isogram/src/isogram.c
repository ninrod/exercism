#include "isogram.h"
#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

char* filter(const char* s) {
  if ((s == NULL) || (s[0] == '\0')) {
    char* s = malloc(2);
    s[0] = '\0';
    return s;
  }
  char* f = malloc(strlen(s) + 1);
  int k = 0;
  for (size_t i = 0; i < strlen(s); i++)
    if (s[i]>='a' && s[i]<='z')
      f[k++] = s[i];
  f[k] = '\0';
  return f;
}

int comp (const void* e1, const void *e2) {
  int a = *((char* ) e1);
  int b = *((char* ) e2);
  if (a < b)
    return -1;
  if (a > b)
    return 1;
  return 0;
}

bool is_isogram(const char phrase[]) {
  char* filtered = filter(phrase);
  char* s = malloc(strlen(filtered) + 1);
  strcpy(s, filtered);
  for(size_t i = 0; i < strlen(s); i++)
    s[i] = tolower(s[i]);
  qsort(s, strlen(s), sizeof(*s), comp);
  printf("sorted string = %s", s);
  for (size_t i = 1; i < strlen(s); ++i)
    if (s[i-1] == s[i]) {
      free(s);
      return false;
    }
  free(s);
  free(filtered);
  return true;
}

/* void dump_result(const char s[]) { */
/*   bool b = is_isogram(s); */
/*   if (b) { */
/*     printf("%s É um isograma!\n", s); */
/*   } else { */
/*     printf("%s NÃO é um isograma!\n", s); */
/*   } */
/* } */

/* int main() { */
/*   dump_result("isogram"); */
/*   dump_result("filipe"); */
/*   dump_result("thumbscrew-japingly"); */
/* } */