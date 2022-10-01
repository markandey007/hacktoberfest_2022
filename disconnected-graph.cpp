// C++ implementation of modified BFS for adjacency matrix
// representation
#include <iostream>
#include <queue>
using namespace std;
void printBFS(int** edges, int V, int start, int* visited);
void BFSHelper(int** edges, int V);
void addEdge(int** edges, int f, int s);

void addEdge(int** edges, int f, int s) { edges[f][s] = 1; }
void printBFS(int** edges, int V, int start, int* visited)
{
	if (V == 0)
		return;
	queue<int> BFS;
	BFS.push(start);
	visited[start] = 1;
	while (!BFS.empty()) {
		int data = BFS.front();
		BFS.pop();
		cout << data << " ";
		for (int i = 0; i < V; i++) {
			if (edges[data][i] == 1) {
				if (visited[i] == 0) {
					BFS.push(i);
					visited[i] = 1;
				}
			}
		}
	}
}

void BFSHelper(int** edges, int V)
{
	if (V == 0)
		return;
	int* visited = new int[V];
	for (int i = 0; i < V; i++) {
		visited[i] = 0;
	}
	for (int i = 0; i < V; i++) {
		if (visited[i] == 0) {
			printBFS(edges, V, i, visited);
		}
	}
}

int main()
{
	int V = 5;
	int E = 6;
	if (E == 0) {
		for (int i = 0; i < V; i++) {
			cout << i << " ";
		}
		return 0;
	}
	int** edges = new int*[V];
	for (int i = 0; i < V; i++) {
		edges[i] = new int[V];
		for (int j = 0; j < V; j++) {
			edges[i][j] = 0;
		}
	}

	addEdge(edges, 0, 4);
	addEdge(edges, 1, 2);
	addEdge(edges, 1, 3);
	addEdge(edges, 1, 4);
	addEdge(edges, 2, 3);
	addEdge(edges, 3, 4);

	BFSHelper(edges, V);
	return 0;
}
