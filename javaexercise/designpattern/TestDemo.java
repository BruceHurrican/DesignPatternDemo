/*
 * BruceHurrican
 * Copyright (c) 2016.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *    This document is Bruce's individual learning the android demo, wherein the use of the code from the Internet, only to use as a learning exchanges.
 *   And where any person can download and use, but not for commercial purposes.
 *   Author does not assume the resulting corresponding disputes.
 *   If you have good suggestions for the code, you can contact BurrceHurrican@foxmail.com
 *   本文件为Bruce's个人学习android的demo, 其中所用到的代码来源于互联网，仅作为学习交流使用。
 *   任和何人可以下载并使用, 但是不能用于商业用途。
 *   作者不承担由此带来的相应纠纷。
 *   如果对本代码有好的建议，可以联系BurrceHurrican@foxmail.com
 */

package javaexercise.designpattern;

/**
 * 观察者模式 dmeo
 * Created by BruceHurrican on 2016/7/17.
 */
public class TestDemo {
    public static void main(String[] args) {
        IParent dad = new DadImpl();
        IParent mum = new MumImpl();

        // 小孩 Bruce
        KidImpl bruce = new KidImpl("打dota~");
        bruce.addObserver(dad);
        bruce.addObserver(mum);
        dad.setAttitude("玩会儿,没有关系");
        mum.setAttitude("不能玩,赶紧去看书");

        // bruce 开始玩了
        bruce.play("Bruce");

        // bruce 不听妈妈话了
        System.out.println("bruce 觉得dad 比较好,就不听 mum 话了");
        bruce.deleteObserver(mum);
        bruce.play("Bruce");

        // 小孩 alice
        KidImpl alice = new KidImpl("看动漫");
        dad.setAttitude("不要宅在家里看动漫");
        mum.setAttitude("外面乱,在家里看动漫好");
        alice.addObserver(dad);
        alice.addObserver(mum);

        // alice 开始看动漫了
        alice.play("Alice");
    }
}
