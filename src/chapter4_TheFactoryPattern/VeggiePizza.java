/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4_TheFactoryPattern;

/**
 *
 * @author dean
 */
class VeggiePizza extends Pizza {

    public VeggiePizza() {
    }

    @Override
    public void prepare() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void bake() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cut() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void box() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
