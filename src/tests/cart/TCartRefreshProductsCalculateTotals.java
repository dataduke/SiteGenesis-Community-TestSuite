/*
 * NOTE: This file is generated. Do not edit! Your changes will be lost.
 */
package tests.cart;
import com.xceptance.xlt.api.engine.scripting.AbstractScriptTestCase;
import com.xceptance.xlt.api.engine.scripting.ScriptName;


/**
 * <p>Test refresh products and calculate sums with update quantity and resort rows in cart.</p>
 * <h1 id="1-setup-and-preparation">1. Setup and preparation</h1>
 * <ul>
 * <li>Start session, open homepage and delete all visible cookies.</li>
 * </ul>
 * <h1 id="2-scope-of-test">2. Scope of test</h1>
 * <h2 id="product-01-change-quantity-via-update-cart">Product 01 - Change quantity via update cart</h2>
 * <ul>
 * <li>Add product 01 to cart (quantity 1).</li>
 * <li>Validate product and subtotal.</li>
 * <li>Increase quantity to random value via update cart function.</li>
 * <li>Calculate formatted total product price based on updated quantity.</li>
 * <li>Validate product price and subtotal.</li>
 * </ul>
 * <h2 id="product-02-change-quantity-via-edit-dialog">Product 02 - Change quantity via edit dialog</h2>
 * <ul>
 * <li>Add product 02 to cart (quantity 2).</li>
 * <li>Calculate formatted total product price.</li>
 * <li>Calculate subtotal and number of items for both products.</li>
 * <li>Validate both products and subtotal.</li>
 * <li>Increase product 02 quantity to random value via edit details dialog.</li>
 * <li>Calculate new subtotal and number of items for both products.</li>
 * <li>Validate calculated values in mini cart header.</li>
 * <li>Validate both products and subtotal on cart page.</li>
 * </ul>
 * <h2 id="product-01-and-02-remove-and-rearrange-rows">Product 01 and 02 - Remove and rearrange rows</h2>
 * <ul>
 * <li>Remove product 01.</li>
 * <li>Validate product 02 is still in cart.</li>
 * <li>Validate subtotal.</li>
 * <li>Remove product 02.</li>
 * <li>Validate emty cart.</li>
 * </ul>
 * <h1 id="3-clean-up">3. Clean up</h1>
 * <ul>
 * <li>End session and clean up created cookies.</li>
 * </ul>
 */
@ScriptName
("tests.cart.TCartRefreshProductsCalculateTotals")
public class TCartRefreshProductsCalculateTotals extends AbstractScriptTestCase
{
}