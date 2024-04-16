# [level 0] 배열의 유사도 - 120903 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120903) 

### 성능 요약

메모리: 77.4 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 04월 16일 17:24:41

### 문제 설명

<p>두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 <code>s1</code>과 <code>s2</code>가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>s1</code>, <code>s2</code>의 길이 ≤ 100</li>
<li>1 ≤ <code>s1</code>, <code>s2</code>의 원소의 길이 ≤ 10</li>
<li><code>s1</code>과 <code>s2</code>의 원소는 알파벳 소문자로만 이루어져 있습니다</li>
<li><code>s1</code>과 <code>s2</code>는 각각 중복된 원소를 갖지 않습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s1</th>
<th>s2</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>["a", "b", "c"]</td>
<td>["com", "b", "d", "p", "c"]</td>
<td>2</td>
</tr>
<tr>
<td>["n", "omg"]</td>
<td>["m", "dot"]</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"b"와 "c"가 같으므로 2를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>같은 원소가 없으므로 0을 return합니다.</li>
</ul>

![](https://velog.velcdn.com/images/ap3878/post/bc665c22-453e-4f7b-b6e3-17e701f42ae2/image.png)채ㅜ

오류
**contains**는 일단 **문자열이 서로 100% 일치하지 않더라도, 포함되기만 하면 true가 리턴**이 되기 때문에 omg의 m과 s2의m이 같으므로 1이되기
때문에 결과값과 달라서 오류가 나타나게 된다.

![](https://velog.velcdn.com/images/ap3878/post/944059b8-9b61-4e80-801e-378cfa841bb3/image.png)

정답
**equals**는 **문자열이 서로 100% 일치해야만 true가 리턴**이 되니
result의 값과 같이 나타나게 된다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
