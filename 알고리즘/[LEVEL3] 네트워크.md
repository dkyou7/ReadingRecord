```python
def solution(n,computers):
    answer = 0
    visited = [False for i in range(n)]
    for com in range(n):
        if visited[com] == False:
            DFS(n,computers,visited,com)
            answer += 1
    return answer


def DFS(n,computers,visited,com):
    visited[com] = True
    for connect in range(n):
        if com != connect and computers[com][connect] == 1:
            if visited[connect] == False:
                DFS(n,computers,visited,connect)
```

