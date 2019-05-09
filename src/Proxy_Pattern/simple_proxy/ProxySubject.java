package Proxy_Pattern.simple_proxy;

/**
 * @author hongfei.shen
 * @date 2019/03/22
 *（代理主题角色）：它包含了对真实主题的引用，从而可以在任何时候操作真实主题对象；在代理主题角色中提供一个与真实主题角色相同的接口，以便在任何时候都可以替代真实主题；代理主题角色还可以控制对真实主题的使用，负责在需要的时候创建和删除真实主题对象，并对真实主题对象的使用加以约束。通常，在代理主题角色中，客户端在调用所引用的真实主题操作之前或之后还需要执行其他操作，而不仅仅是单纯调用真实主题对象中的操作。
 */
public class ProxySubject extends Subject {

    private RealSubject realSubject = new RealSubject();//维持一个对真实主题对象的引用

    @Override
    public void request() {
        this.preRequest();
        realSubject.request();//调用真实主题对象的方法
        this.postRequest();
    }

    public void preRequest() {

    }

    public void postRequest() {
    }

}
