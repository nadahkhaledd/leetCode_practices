class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c == '(' or c == '{' or c == '[':
                stack.append(c)
                
            if c == ')':
                if(len(stack) == 0 or stack[-1] != ('(')):
                    return False
                else:
                    stack.pop()
                    
            if c == '}':
                if(len(stack) == 0 or stack[-1] != ('{')):
                    return False
                else:
                    stack.pop()
            
            if c == ']':
                if(len(stack) == 0 or stack[-1] != ('[')):
                    return False
                else:
                    stack.pop()
        
        return len(stack) == 0