# WAP with function to find the smallest and largest word in a given string
def demo(str):
    word = str.split()
    sm_word = min(word, key=len)
    lg_word = max(word, key=len)
    print(f"Smallest Word of String:{sm_word} \nLargest Word of String:{lg_word}")


str = input("Enter String:")
demo(str)
