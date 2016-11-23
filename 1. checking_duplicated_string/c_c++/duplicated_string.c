#include <stdio.h>
#include <string.h>
#include <stdbool.h>

#define MAX_ASCII_COUNT 255

bool check_duplicated_string(char *string)
{
    int string_len = strlen(string);

    if (string_len > MAX_ASCII_COUNT) {
        return false;
    }

    int i = 0;
    char temp_buffer[255] = {0};
    
    for (i = 0; i < string_len; i++) {
        if (temp_buffer[string[i]] >= 1) {
            return false;
        }

        temp_buffer[string[i]] += 1;
    }

    return true;
}


void main()
{
    char string[255] = {0, };

    printf("Input the string : ");
    scanf("%s", string);

    if (check_duplicated_string(string)) {
        printf("True\n");
    } else {
        printf("False\n");
    }
}
