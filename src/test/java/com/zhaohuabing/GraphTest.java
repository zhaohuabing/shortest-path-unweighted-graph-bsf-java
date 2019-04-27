package com.zhaohuabing;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GraphTest {

  @Test
  public void testShortestPath1() {
    Graph graph = this.constructGraph();
    List<String> result = graph.shortestPath("A","F");
    System.out.println(result);
    assertEquals(result.size(), 4);
  }

  @Test
  public void testShortestPath2() {
    Graph graph = this.constructGraph();
    List<String> result = graph.shortestPath("A","E");
    System.out.println(result);
    assertEquals(result.size(), 3);
  }

  @Test
  public void testShortestPath3() {
    Graph graph = this.constructGraph();
    List<String> result = graph.shortestPath("C", "F");
    System.out.println(result);
    assertEquals(result.size(), 3);
  }

  /**
   * Create a graph for testing
   *
   *             B          D
   *       .-+---------.'-------F
   *    .-'  |       .' |
   * A.'     |     .'   |
   *   `.    |   .'     |
   *     `-. | .'       |
   *        `.'---------+
   *         C          E
   */
  private Graph constructGraph() {
    Graph graph = new Graph();
    graph.addEdge("A", "B");
    graph.addEdge("A", "C");
    graph.addEdge("B", "C");
    graph.addEdge("B", "D");
    graph.addEdge("C", "D");
    graph.addEdge("C", "E");
    graph.addEdge("D", "E");
    graph.addEdge("D", "F");
    return graph;
  }
}
