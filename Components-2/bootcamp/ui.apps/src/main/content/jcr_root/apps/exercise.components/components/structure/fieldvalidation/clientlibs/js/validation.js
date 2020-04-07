(function(window, $) {
  'use strict';
$.validator.register({
  selector: 'input[data-validation="minlength"]',
  validate: function(el) {
    console.log("helloooooo");
    var min = parseInt(el.data("minlength"));
    var value = $(el).val();
    var length = value.length;

    if (length < min) {
      return "The field needs to be minimum " + min + " characters. It currently has a length of " + length + ".";
    }
  }
  });
})(window, jQuery);

