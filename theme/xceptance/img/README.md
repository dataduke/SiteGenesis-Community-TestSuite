# Xceptance-RetinaFavicons for Favicons, Apple Touch Icons and Windows 8 Tiles

1. Install your favicon
2. Download your package: Favicon package
3. Extract this package in <web site>/theme/xceptance/img/. If your site is http://mysite.com, you should be able to access a file named http://mysite.com/theme/xceptance/img/favicon.ico.
4. Insert the following code in the <head> section of your HTML pages:

  <!-- Favicon -->
  <link rel="shortcut icon" href="theme/xceptance/img/favicon.ico">
  <link rel="icon" type="image/png" href="theme/xceptance/img/favicon-192.png" sizes="192x192">
  <link rel="icon" type="image/png" href="theme/xceptance/img/favicon-160.png" sizes="160x160">
  <link rel="icon" type="image/png" href="theme/xceptance/img/favicon-96.png" sizes="96x96">
  <link rel="icon" type="image/png" href="theme/xceptance/img/favicon-16.png" sizes="16x16">
  <link rel="icon" type="image/png" href="theme/xceptance/img/favicon-32.png" sizes="32x32">

  <!-- Apple Touch Icons -->
  <link rel="apple-touch-icon" href="theme/xceptance/img/apple-touch-icon.png">
  <link rel="apple-touch-icon" sizes="57x57" href="theme/xceptance/img/apple-touch-icon-57.png">
  <link rel="apple-touch-icon" sizes="114x114" href="theme/xceptance/img/apple-touch-icon-114.png">
  <link rel="apple-touch-icon" sizes="72x72" href="theme/xceptance/img/apple-touch-icon-72.png">
  <link rel="apple-touch-icon" sizes="144x144" href="theme/xceptance/img/apple-touch-icon-144.png">
  <link rel="apple-touch-icon" sizes="60x60" href="theme/xceptance/img/apple-touch-icon-60.png">
  <link rel="apple-touch-icon" sizes="120x120" href="theme/xceptance/img/apple-touch-icon-120.png">
  <link rel="apple-touch-icon" sizes="76x76" href="theme/xceptance/img/apple-touch-icon-76.png">
  <link rel="apple-touch-icon" sizes="152x152" href="theme/xceptance/img/apple-touch-icon-152.png">
  <link rel="apple-touch-icon" sizes="180x180" href="theme/xceptance/img/apple-touch-icon-180.png">

  <!-- Win 8 Tile -->
  <meta name="msapplication-TileColor" content="#de0006">
  <meta name="msapplication-TileImage" content="theme/xceptance/img/mstile-144.png">
  <meta name="msapplication-config" content="theme/xceptance/img/browserconfig.xml">