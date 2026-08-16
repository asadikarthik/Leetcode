class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        l = []

        for i in tokens:
            if i == "+":
                b = l.pop()
                a = l.pop()
                l.append(a + b)

            elif i == "-":
                b = l.pop()
                a = l.pop()
                l.append(a - b)

            elif i == "*":
                b = l.pop()
                a = l.pop()
                l.append(a * b)

            elif i == "/":
                b = l.pop()
                a = l.pop()
                l.append(int(a / b))

            else:
                l.append(int(i))

        return l[0]