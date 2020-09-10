<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Vue 测试实例 - 菜鸟教程(runoob.com)</title>
</head>
<style>
    .class1{
        background: rosybrown;
        color: red;
    }
</style>
<body>
<script src="https://cdn.staticfile.org/vue/2.2.2/vue.min.js"></script>

<div id="app">
    <label for="r1">修改颜色</label><input type="checkbox" v-model="use" id="r1">
    <br><br>
    <div v-bind:class="{'class1': use}">
        v-bind:class 指令
    </div><br>
    {{5+5}}<br>
    {{ok ? 'YES' : 'NO'}}<br>
    {{message.split('').reverse().join('')}}
    <div v-bind:id="'list-'+id">菜鸟教程<div>
        <P>{{message}}<P>
        <input v-model="message">
        <button v-on:click="reverseMessage">反转字符串</button>

        <ol>
            <li v-for="site in sites">
                {{ site.name }}
            </li>
        </ol><br>

        <ul>
            <li v-for="(value,key,index) in object">
             {{index}} :{{key}} : {{value}}
            </li>
        </ul>

        <p style="font-size: 25px;">计算机:{{counter}}</p>
        <button @click ="counter++" style="font-size: 25px;">点我</button>
</div>

<script>
    var vm =  new Vue({
        el: '#app',
        data:{
            counter : 1,
            use: false,
            ok: true,
            message: 'RUNOOB',
            id : 10,
            sites: [
                { name: 'Runoob' },
                { name: 'Google' },
                { name: 'Taobao' }
            ],
            object : {
                name : '光头',
                sex : '男',
                age : 21,
                addr : '冷水滩'
            }
        },
        methods: {
            reverseMessage :function () {
                this.message = this.message.split('').reverse().join()
            }

        }
    })
    vm.$watch('counter', function(nval, oval) {
        alert('计数器值的变化 :' + oval + ' 变为 ' + nval + '!');
    });
</script>
</body>
</HTML>