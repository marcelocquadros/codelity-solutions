package main

import (
	"fmt"
)

func main() {
       
	a := []int{6,7,56,1}
	
	sorted := false

	var temp int

	for !sorted {
		sorted = true
		for i := 0; i < len(a)-1; i++ {
			if a[i] > a[i+1] {
				temp = a[i]
				a[i] = a[i+1]
				a[i+1] = temp
				sorted = false
			}

		}
	}

	fmt.Println(a)

}
