# Function to check whether any pair exists
# whose sum is equal to the given target value
print("Array Two Sum:")
def two_sum(arr, target):
    # Sort the array
    left = 0
    right = len(arr) - 1

    # Iterate while left pointer is less than right
    while left < right:
        sum = arr[left] + arr[right]
        print(f"Checking: arr[{left}] + arr[{right}] = {arr[left]} + {arr[right]} = {sum}")

        # Check if the sum matches the target
        if sum == target:
            return True
        elif sum < target: 
            left += 1  # Move increment pointer to the right
        else:
            right -= 1 # Move decrement pointer to the left

    # If no pair is found
    return False

arr = [-8, 1, 4, 6, 10, 45, 50]
target = int(input("Enter the target: "))

# Call the two_sum function and print the result
if two_sum(arr, target):
    print(f"The total arr: {target} --> true")
else:
    print(f"The total arr: {target} --> false")


print("")
print()
print("===========================")
print("Palindrome Checker")
def is_palindrome(s):
    left = 0
    right = len(s) - 1

    while left < right:
        if s[left] != s[right]:
            return False
        left += 1
        right -= 1

    return True

# Example
print("\n'racecar' is the palindrome: ", is_palindrome("racecar"))  # True
print("'hello' is the plaindrome: ", is_palindrome("hello"))    # False