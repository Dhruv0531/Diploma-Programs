# WAP to demonstrate the L-E-G function scope in Python.
# L - Local, E - Enclosing, G - Global
global_var = "This is global variable"  # Global Variable


def scope():
    local_var = "This is local variable"  # Local Variable
    enclosing_outer_var = "This is enclosing outer variable "
    print("Local Scope:", local_var)
    print("Global Scope (Inside Function):", global_var)

    def inner():
        enclosing_inner_var = "This is enclosing inner variable"
        print("Enclosing Scope:", enclosing_outer_var)
        print("Enclosing Scope:", enclosing_inner_var)
    inner()


print("Global Scope(Outside Function):", global_var)
scope()
