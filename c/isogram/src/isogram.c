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

void lower_str(char *s) {
  for(size_t i = 0; i < strlen(s); i++)
    s[i] = tolower(s[i]);
}

bool is_isogram(const char phrase[]) {
  char* lower = malloc(strlen(phrase) + 1);
  strcpy(lower, phrase);
  lower_str(lower);
  char* filtered = filter(lower);
  free(lower);
  qsort(filtered, strlen(filtered), sizeof(*filtered), comp);
  for (size_t i = 1; i < strlen(filtered); ++i)
    if (filtered[i-1] == filtered[i]) {
      free(filtered);
      return false;
    }
  free(filtered);
  return true;
}