import re
email = "pynight@boozallenhamilton.com"
pat2 = "(\w+)@(\w+)\.(\w+)"
r2 = re.match(pat2, email)
print(r2.group(1))
