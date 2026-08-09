<h2><a href="https://www.geeksforgeeks.org/problems/bitonic-generator-sort3343/1">Bitonic Generator Sort</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong>, perform the following operations. </span></p>
<ul>
<li><span style="font-size: 18px;">Sort all elements at even indices in increasing order and all elements at odd indices in decreasing order. </span></li>
<li><span style="font-size: 18px;">Construct the final array by placing all sorted even-indexed elements first, followed by all sorted odd-indexed elements in decreasing order.</span></li>
</ul>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [1, 1, 2, 3, 4, 5, 6, 7]
<strong>Output:</strong> [1, 2, 4, 6, 7, 5, 3, 1]
<strong>Explanation</strong>: Even-indexed elements are 1, 2, 4, 6, which after sorting become 1, 2, 4, 6. Odd-indexed elements are 1, 3, 5, 7, which after sorting in decreasing order become 7, 5, 3, 1. The final array is formed by placing the sorted even-indexed elements first, followed by the sorted odd-indexed elements.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [3, 1, 2, 4, 5, 9, 13, 14, 12]
<strong>Output:</strong> [2, 3, 5, 12, 13, 14, 9, 4, 1]
<strong>Explanation</strong>: Even-indexed elements are 3, 2, 5, 13, 12, which after sorting become 2, 3, 5, 12, 13. Odd-indexed elements are 1, 4, 9, 14, which after sorting in decreasing order become 14, 9, 4, 1. The final array is formed by placing the sorted even-indexed elements first, followed by the sorted odd-indexed elements.</span><span style="font-size: 18px;"><sup><br></sup></span></pre></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Zoho</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;<code>STL</code>&nbsp;