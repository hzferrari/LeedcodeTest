#include <stdio.h>
#include <stdlib.h>

#ifndef ARRAY_LEN
#define ARRAY_LEN(arr) (sizeof (arr) / sizeof (arr[0]))
#endif

int is_even(int x)
{
	return 0 == x % 2;
}

int compare_rule(int x, int y)
{
	if (is_even(x)) {
		if (is_even(y))
			return y - x;
		else
			return 1;
	}
	else {
		if (is_even(y))
			return -1;
		else
			return x - y;
	}
}

int compare_warp(const void *x, const void *y)
{
	return compare_rule(*(int *)x, *(int *)y);
}

int compare_warp_normal(const void *x, const void *y)
{
	return *(int *)x - *(int *)y;
}

int main()
{
	/* int arr[] = {0,1,2,3,4,5,6,7,8,9}, i; */
	int arr[] = { 2, 3, 4, 5, 8, 10, 12, 11 }, i;

	for (i = 0; i < ARRAY_LEN(arr); ++i)
		printf("%d ", arr[i]);
	printf("\n");

	qsort(arr, ARRAY_LEN(arr), sizeof (arr[0]), compare_warp);

	for (i = 0; i < ARRAY_LEN(arr); ++i)
		printf("%d ", arr[i]);
	printf("\n");

	return 0;
}