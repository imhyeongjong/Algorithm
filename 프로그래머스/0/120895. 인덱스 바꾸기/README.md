# [level 0] 인덱스 바꾸기 - 120895 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120895) 

### 성능 요약

메모리: 73.8 MB, 시간: 1.24 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 04월 16일 16:18:26

### 문제 설명

<p>문자열 <code>my_string</code>과 정수 <code>num1</code>, <code>num2</code>가 매개변수로 주어질 때, <code>my_string</code>에서 인덱스 <code>num1</code>과 인덱스 <code>num2</code>에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 &lt; <code>my_string</code>의 길이 &lt; 100</li>
<li>0 ≤ <code>num1</code>, <code>num2</code> &lt; <code>my_string</code>의 길이</li>
<li><code>my_string</code>은 소문자로 이루어져 있습니다.</li>
<li><code>num1</code> ≠ <code>num2</code></li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>num1</th>
<th>num2</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"hello"</td>
<td>1</td>
<td>2</td>
<td>"hlelo"</td>
</tr>
<tr>
<td>"I love you"</td>
<td>3</td>
<td>6</td>
<td>"I l veoyou"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.</li>
</ul>

![](https://velog.velcdn.com/images/ap3878/post/9a449029-0f49-48ab-b555-fd12704662c1/image.png)

**오류**
이미 num1의 문자를 num2로 바꿔주었기 때문에
밑에 num2의 문자를 num1로 바꿔주면 위에있던 num1의 문자로 인식이 되니
저렇게 오류가 날수 밖에 없다.

![](https://velog.velcdn.com/images/ap3878/post/d6448b66-60f3-402e-b03d-5019e80dbd53/image.png)

**설명**
그러므로 한번에 적용을 하지 못하게 temp에는 num1에 값만
num2는 num1의 값만 적용 그 후 num2는 temp의 값인 num1을 적용 시킨다.
이렇게 해주면 위에있는 것을 해치지 않고 적용 해줄수 있게된다.

> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
