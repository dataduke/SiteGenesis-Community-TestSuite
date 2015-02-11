# Guide

This document describes the defined test suite naming conventions, gives a short introduction to test suite development and shows some test suite examples. The last part contains some pointers to various helpful resources on other websites. 

## Test Suite Conventions

The following styling rules were quite consequently applied to form a solid structure and define consistent descriptions and comments as well as establish a naming scheme for packages, tests and modules. The elaborately discussed style guidelines may serve as a loose pointer to build your uniform test suite or be completely adapted to your needs. (Names written in `{}` are required. Names written in `[]` are optional.) 

### Naming of Packages

- Packages for Tests in Shop Areas: `tests.{area}`
- Packages for Modules on Pages: `modules.pages.{page}`
- Packages for Modules at Global Elements: `modules.global.[area]`
- Packages for Helper Modules: `modules.helper.[area]`

### Naming of Tests

- Tests: `T{Area}{TestScope}_{interaction}{Name}`

### Naming of Modules

- Modules: `M{Page}_[PagePart]_{interaction}{Name}`
- Validation Modules: `V{Page}_[PagePart]_{interaction}{Name}`
- Flow Modules: `F{StartPage}_{interaction}{Name}`

### Naming of Variables

Variable names are written in `camelCase` notation starting with a lowercase letter.

- Test Data: `{name}` 
- Dynamic Variables: `{name}_varDynamic`
- Module Parameters: `{name}`
- Module Parameters (which need assignment as variable name): `{name}_varName`

### Element Names

This section defines the element names which are part of the naming scheme of packages, tests and modules.

**{Area} and {Page}**

- `Homepage`: main landing page.
- `Search`: search box and search results page.
- `Catalog`: catalog page, product grid/listing/overview page (PGP/PLP/POP).
- `ProductDetailPage`: product detail page (PDP).
- `MiniCart`: minicart pop up in global header.
- `Cart`: cart page.
- `Checkout`: checkout pages with shipping, billing, place orde and order confirmation.
- `Account`: account page also known as my account.

**{interaction}**

- `click`: click a button or link.
- `select`: select from dropdown menus or radio buttons.
- `check`: mark checkboxes.
- `enter`: enter text or values in input fields.
- `hover`: mouse over a link to open js menu etc.
- `store`: store text or values from a page for following validations.
- `validate`: verify and assert values, parameters or elements.
- `flow`: flow to process several modules.

**{Name} or {name}**

Names can be longer descriptions containing one of the following terms for example.

- `Customer`: registered user with account.
- `Guest`: unregistered user without account.
- `ProductNumber`: product stock keeping unit (SKU).

## Test Suite Development

This short introduction outlines the process of test suite development on the foundation of the provided modules. It may help you to build your first own tests. Basically there are two major steps. The first step is to define a desired business process on a **sheet of paper** (requirements engineering). The second step is to actually build the corresponding test case based on existing modules in **XLT Script Developer** (test development).

#### Step 1: Define a Desired Business Process

Think about the business process you want to simulate and then define it. An example written on a **sheet of paper**:

> Start a `session` and go to a `category` at the `catalog`. Click a `product` and end up on a `productdetailpage`. Change product details like `color`, `size` and `quantity` and decide to add the product to `wish list`. The shop will ask to `create an account`. Enter `profile` data and submit. Validate that `product` with selected details like `color`, `size` and `quantity` is saved in `wish list`. Leave the shop until your next visit and end the `session`.

####  Step 2: Build the Corresponding Test Case

By following these development steps you may implement your own test case in **XLT Script Developer**:

- **Create** a new `test case` and write an informal list of short steps describing the simulated process.
- **Insert** `comment` lines in the `test case` with step descriptions aggregated by their interacted `pages`.
- **Drag and drop** the needed `modules` from the `pages` packages in the project tree into the `test`. 
- **Configure** specific `test data` at the `test case` and dynamic variables for used `modules`.

Congratulations, you may **run your first own test now**. For advanced development you might have to build your own modules. Therefore please refer to the official XLT documentation.

## Test Suite Examples

Following are some examples (ex.) of module commands used for text matching, text operation or text conversion.

#### Text Matching

_ex. Order date pattern matching_ 

| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `assertText`  | `css=#main .order-date .value`                      | `regexp:[A-Z][a-z]{2} [0-9]{2}, [0-9]{4}` |

_ex. Order number pattern matching_ 

| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `assertText`  | `css=#main .order-number .value`                    | `regexp:00[0-9]{6}`                       |

_ex. Case insensitive pattern matching_ 

| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `assertText`  | `css=#main .label .capitalized`                     | `regexpi:LOWERCASE uppercase Ignored `    |

_ex. Match inner substring_ 

| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `assertText`  | `css=#main .shipping-address .city-state-postal`    | `*${state}*`                              |

#### Text Operation

_ex. Remove trailing whitespace_ 

| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `storeEval`   | `"${blockTotalsShipping}".trim()`                   | `totalsShipping`                          |


_ex. Substring inclusive until last character_ 
 
| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `storeEval`   | `"${creditCardNumber}".substring(12,16)`            | `creditCardLastFourDigits`                |


_ex. Substring exclusive until first occurence (three different ways)_

| Command       | Target                                              | Value                                     |
| :------------ | :-------------------------------------------------- | :---------------------------------------- |
| `storeEval`   | `"${sMLabel}".slice(0, "${sMLabel}".indexOf(‘:’)`   | `shippingMethodName`                      |
| `storeEval`   | `"${shippingMethodLabel}".match(/[^:]*/)`           | `shippingMethodName`                      |
| `storeEval`   | `"${shippingMethodLabel}".replace(/\:.*$/,"")`      | `shippingMethodName`                      |

#### Text Conversion

_ex. Convert full english month name to number with two digits_  

| Command       | Target                                              | Value                                    |
| :------------ | :-------------------------------------------------- | :--------------------------------------- |
| `storeEval`   | see target below                                    | `monthNumber`                            |

__Target:__  

    ("0" + ("January___February__March_____April_____May_______June______July______August____September_October___November__December__".indexOf("@{monthName}")/ 10 + 1)).slice(-2)

## Additional Resources

Here are some links to other helpful resources for test development.

#### Xceptance

- [Xceptance](https://www.xceptance.de/en/)
- [Xceptance Blog](http://blog.xceptance.com/)
- Xceptance Blog: [Test Automation for Demandware SiteGenesis with XLT](http://blog.xceptance.com/2012/10/27/test-automation-for-demandware-sitegenesis-with-xlt/)
- Xceptance Blog: [Use XLT with Sauce Labs and BrowserStack](http://blog.xceptance.com/2014/03/12/use-xlt-with-sauce-labs-and-browserstack/)

#### XLT

- XLT [Main](https://www.xceptance.de/en/xlt/)
- XLT [Manual](https://lab.xceptance.de/releases/xlt/latest/user-manual.html)
- XLT [Quick Start](https://lab.xceptance.de/releases/xlt/latest/quick-start-guide.html)
- XLT Script Developer: [Firefox Addon EN](https://addons.mozilla.org/en-US/firefox/addon/xceptance-script-developer/), [Firefox Addon DE](https://addons.mozilla.org/de/firefox/addon/xceptance-script-developer/)
- XLT Descriptions & Comments: [GitHub Markup](https://github.com/github/markup/tree/master#html-sanitization), [GitHub Flavored Markdown](https://help.github.com/articles/github-flavored-markdown/), [Markdown](http://daringfireball.net/projects/markdown/), [MultiMarkdown](http://fletcherpenney.net/multimarkdown/)

#### Demandware

- [Demandware](http://www.demandware.com/)
- Demandware [SiteGenesis](http://www.demandware.com/on/demandware.store/Sites-SiteGenesis-Site) (Default Shop Implementation)

#### W3C

- W3C All Standards and Drafts [Technical Reports](http://www.w3.org/TR/)
- W3C [DOM TR](http://www.w3.org/TR/dom/)
- W3C [HTML & CSS Portal](http://www.w3.org/standards/webdesign/htmlcss.html), [HTML TR](http://www.w3.org/TR/html/)
- W3C [CSS Portal](http://www.w3.org/Style/CSS/), [CSS TR](http://www.w3.org/TR/CSS/), [CSS Selectors TR](http://www.w3.org/TR/selectors/#selectors)
- W3C [Javascript Portal](http://www.w3.org/standards/webdesign/script.html), [JS All](http://www.w3.org/standards/techs/js#w3c_all)
- W3C [XPath All](http://www.w3.org/standards/techs/xpath#w3c_all), [XPath TR](http://www.w3.org/TR/xpath-30/), [XPath Functions TR](http://www.w3.org/TR/xpath-functions-30/)
- W3C [XML Portal](http://www.w3.org/standards/xml/)

#### W3Schools

- W3Schools [References](http://www.w3schools.com/sitemap/sitemap_references.asp), [Tutorials](http://www.w3schools.com/sitemap/default.asp), [Examples](http://www.w3schools.com/sitemap/sitemap_examples.asp)
- W3Schools [HTML](http://www.w3schools.com/html/)
- W3Schools [CSS](http://www.w3schools.com/cssref/), [CSS Selectors](http://www.w3schools.com/cssref/css_selectors.asp)
- W3Schools [JavaScript Reference](http://www.w3schools.com/jsref/), [JavaScript Regexp](http://www.w3schools.com/jsref/jsref_obj_regexp.asp)
- W3Schools [XPath, XQuery and XSLT Functions](http://www.w3schools.com/xpath/)

#### Other

- Selenium [Docs](http://docs.seleniumhq.org/docs/), [RegEx](http://docs.seleniumhq.org/docs/02_selenium_ide.jsp#regular-expression-patterns)
- RegEx [Quickstart](http://www.rexegg.com/regex-quickstart.html)
- Ant [Manual](https://ant.apache.org/manual/running.html)
