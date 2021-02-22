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

```python
def solution(n,computers):
    answer = 0
    visited = [False for i in range(n)]
    for com in range(n):
        if visited[com] == False:
            BFS(n,computers,visited,com)
            answer += 1
    return answer


def BFS(n,computers,visited,com):
    visited[com] = True
    q = []
    q.append(com)
    while len(q) != 0:
        com = q.pop(0)
        visited[com] = True
        for connect in range(n):
            if connect != com and computers[com][connect] == 1:
                if visited[connect] == False:
                    q.append(connect)
```

